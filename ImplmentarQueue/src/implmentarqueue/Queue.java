package implmentarqueue;

public class Queue {
    
    int front, rear, capacity;
    Object[] elements;

    public Queue() {
        front = rear = -1;
        capacity = 10;
        elements = new Object[capacity];

    }

    public void Enqueue(Object elem) {

        Object NewElem = new Object();
        if (front == -1) {
            front = rear = 0;
            elements[rear] = NewElem;
        }
        if (rear > front) {
            if (rear == capacity) {
                if (front > 0) {
                    rear = 0;
                    elements[rear] = NewElem;
                     if(front -1 != rear) {
                        rear++;
                        elements[rear]=NewElem;
                    }
                }
                IncreaseCapacityIfNecessary();
            }
            elements[rear + 1] = NewElem;
            rear++;
        }
    }
}

