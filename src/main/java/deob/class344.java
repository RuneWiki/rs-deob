package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ma")
public class class344 {

    @ObfuscatedName("ma.z")
    public Inflater field4040;

    public class344() {
        this(-1, 1000000, 1000000);
    }

    public class344(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ma.z(Lkf;[BI)V")
    public void method6139(class310 arg0, byte[] arg1) {
        if (arg0.field3731[arg0.field3734] != 31 || arg0.field3731[arg0.field3734 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4040 == null) {
            this.field4040 = new Inflater(true);
        }
        try {
            this.field4040.setInput(arg0.field3731, arg0.field3734 + 10, arg0.field3731.length - (arg0.field3734 + 10 + 8));
            this.field4040.inflate(arg1);
        } catch (Exception var4) {
            this.field4040.reset();
            throw new RuntimeException("");
        }
        this.field4040.reset();
    }
}
