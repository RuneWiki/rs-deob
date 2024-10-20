package deob;

import java.util.zip.Inflater;

@ObfuscatedName("pt")
public class class437 {

    @ObfuscatedName("pt.c")
    public Inflater field4600;

    public class437() {
        this(-1, 1000000, 1000000);
    }

    public class437(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("pt.c(Lpi;[BI)V")
    public void method7180(class419 arg0, byte[] arg1) {
        if (arg0.field4477[arg0.field4475] != 31 || arg0.field4477[arg0.field4475 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4600 == null) {
            this.field4600 = new Inflater(true);
        }
        try {
            this.field4600.setInput(arg0.field4477, arg0.field4475 + 10, arg0.field4477.length - (arg0.field4475 + 10 + 8));
            this.field4600.inflate(arg1);
        } catch (Exception var4) {
            this.field4600.reset();
            throw new RuntimeException("");
        }
        this.field4600.reset();
    }
}
