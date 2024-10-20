package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ru")
public class class483 {

    @ObfuscatedName("ru.a")
    public Inflater field5005;

    public class483() {
        this(-1, 1000000, 1000000);
    }

    public class483(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ru.a(Lqr;[BI)V")
    public void method8290(class464 arg0, byte[] arg1) {
        if (arg0.field4867[arg0.field4864] != 31 || arg0.field4867[arg0.field4864 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5005 == null) {
            this.field5005 = new Inflater(true);
        }
        try {
            this.field5005.setInput(arg0.field4867, arg0.field4864 + 10, arg0.field4867.length - (arg0.field4864 + 10 + 8));
            this.field5005.inflate(arg1);
        } catch (Exception var4) {
            this.field5005.reset();
            throw new RuntimeException("");
        }
        this.field5005.reset();
    }
}
