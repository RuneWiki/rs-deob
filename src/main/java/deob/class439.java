package deob;

import java.util.zip.Inflater;

@ObfuscatedName("pw")
public class class439 {

    @ObfuscatedName("pw.c")
    public Inflater field4638;

    public class439() {
        this(-1, 1000000, 1000000);
    }

    public class439(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("pw.c(Lpi;[BI)V")
    public void method7222(class421 arg0, byte[] arg1) {
        if (arg0.field4511[arg0.field4512] != 31 || arg0.field4511[arg0.field4512 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4638 == null) {
            this.field4638 = new Inflater(true);
        }
        try {
            this.field4638.setInput(arg0.field4511, arg0.field4512 + 10, arg0.field4511.length - (arg0.field4512 + 10 + 8));
            this.field4638.inflate(arg1);
        } catch (Exception var4) {
            this.field4638.reset();
            throw new RuntimeException("");
        }
        this.field4638.reset();
    }
}
