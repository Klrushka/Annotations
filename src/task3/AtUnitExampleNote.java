package task3;

public class AtUnitExampleNote {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @TestNote(note = "methodOne")
    @Test
    void TMethodOne() {
        assert methodOne().equals("methodOne");
    }

    @TestNote(note = "methodTwo")
    @Test
    void TMethodTwo() {
        assert methodTwo() == 2;
    }
/*
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                 "java task3.AtUnit AtUnitExampleNote");
    }

 */
}
