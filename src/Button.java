public class Button{
        OnClickListener ocl;
        void setOnClickListener(OnClickListener ocl){
            this.ocl = ocl;
        }

        static interface OnClickListener{
            void onClick();
        }

        void click(){
            ocl.onClick();
        }
    }

