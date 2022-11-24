public class queue {
    static class QueueUsingArray{  // static class isiliye bna rhe hai kyunki jb main static hai static se call
        // lrne k liye jo class banaya gya hai wo v static hi hona padega tb hi main usko call kr skta hai
        int front_key;  //
        int rear_q;  // rear_q is one less than the size or capacity_of_queue  observe kiye to pta chala pr kaise?
        int capacity_of_queue;
        static int[] q1;

        QueueUsingArray(int size){  // constructor bna rhe
            capacity_of_queue=size;
            q1=new int[capacity_of_queue];  // creating the array

        }
        void enqueue(int value){  // method bna rhe element add krne k liye
            if (rear_q==capacity_of_queue){
                System.out.println("element cant be added as the queue is already full");
            }
            else{
                q1[rear_q]=value;
                rear_q++;    // shuru mein rear key 0 hai to oth position pr kuch add hoga
                                // phir rear key 1 ho jaega to 1st position pr add hoga likewise
            }

        }
        void dequeue(){ // method bna rhe element remove krne k liye
            if (rear_q==0){
                System.out.println(" queue is already empty ");
            }
            else{
                for(int i=0;i<rear_q-1;i++){
                    q1[i]=q1[i+1]; // pehla element delete hota as 1st in 1st out ko follow krta hai
                                    // to pehla element gayab ka matlab hua ki sarein element ko ek peeche
                                    //shift krna hoga isiliye rear_q-1 tk gye kyunki last elemnt to 2nd last element
                                     // ho gya na


                }
                rear_q--;  // ab jb ek element ghat gya to total length v to ek kamega na
            }

        }
        void display(){
            if (rear_q==0){
                System.out.println(" queue is empty, noting to display ");
            }
            else{
                for(int i=0;i<rear_q;i++) {
                    System.out.print(q1[i]+" ");
                }
        }
    }
    public static void main(String[] args) {
            QueueUsingArray q2= new QueueUsingArray(1); // object creation
            q2.enqueue(6);  // ye add ho gya
            q2.enqueue(5); // ye add ni hua kyunki size 1 tha aur ye dusra element ho gya
        System.out.println("");
        q2.display(); // jo present tha show ho gya
        System.out.println();

        QueueUsingArray q3= new QueueUsingArray(4);
        q3.enqueue(3);
        q3.enqueue(4);q3.enqueue(5);q3.enqueue(6); // full bhar gaya
        q3.display();
        System.out.println();
        q3.dequeue();// ek gayab hua front the front
        q3.display();
        q3.dequeue();q3.dequeue();q3.dequeue();  // ab sara khali ho gaya
        System.out.println();
        q3.display();  // ab kuch nhi bacha
        q3.dequeue(); // already emty tha

    }

    }
}
