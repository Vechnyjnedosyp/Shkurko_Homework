package eu.senla.task7.roboРarts;

public class Body {

    private FormBody formBody;

    public Body() {
    }

    public Body(FormBody formBody) {
        this.formBody = formBody;
    }

    public Body(int numOfForm) {
        switch (numOfForm){
            case 1:
                this.formBody = FormBody.SMALL;
                break;
            case 2:
                this.formBody = FormBody.MIDDLE;
                break;
            case 3:
                this.formBody = FormBody.LARGE;
                break;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(formBody);
    }
}
