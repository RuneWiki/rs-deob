package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vs")
public class class572 {

    @ObfuscatedName("vs.ac")
    public Inflater field5571;

    public class572() {
        this(-1, 1000000, 1000000);
    }

    public class572(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vs.ac(Lvf;[BI)V")
    public void method9614(class551 arg0, byte[] arg1) {
        if (arg0.field5413[arg0.field5415] != 31 || arg0.field5413[arg0.field5415 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5571 == null) {
            this.field5571 = new Inflater(true);
        }
        try {
            this.field5571.setInput(arg0.field5413, arg0.field5415 + 10, arg0.field5413.length - (arg0.field5415 + 10 + 8));
            this.field5571.inflate(arg1);
        } catch (Exception var4) {
            this.field5571.reset();
            throw new RuntimeException("");
        }
        this.field5571.reset();
    }
}
