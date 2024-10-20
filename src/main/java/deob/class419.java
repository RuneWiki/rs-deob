package deob;

import java.util.zip.Inflater;

@ObfuscatedName("pt")
public class class419 {

    @ObfuscatedName("pt.l")
    public Inflater field4416;

    public class419() {
        this(-1, 1000000, 1000000);
    }

    public class419(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("pt.l(Lot;[BI)V")
    public void method6808(class401 arg0, byte[] arg1) {
        if (arg0.field4294[arg0.field4292] != 31 || arg0.field4294[arg0.field4292 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4416 == null) {
            this.field4416 = new Inflater(true);
        }
        try {
            this.field4416.setInput(arg0.field4294, arg0.field4292 + 10, arg0.field4294.length - (arg0.field4292 + 10 + 8));
            this.field4416.inflate(arg1);
        } catch (Exception var4) {
            this.field4416.reset();
            throw new RuntimeException("");
        }
        this.field4416.reset();
    }
}
