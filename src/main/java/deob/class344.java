package deob;

import java.util.zip.Inflater;

@ObfuscatedName("mu")
public class class344 {

    @ObfuscatedName("mu.m")
    public Inflater field4029;

    public class344() {
        this(-1, 1000000, 1000000);
    }

    public class344(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mu.m(Lkn;[BI)V")
    public void method6169(class310 arg0, byte[] arg1) {
        if (arg0.field3736[arg0.field3734] != 31 || arg0.field3736[arg0.field3734 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field4029 == null) {
            this.field4029 = new Inflater(true);
        }
        try {
            this.field4029.setInput(arg0.field3736, arg0.field3734 + 10, arg0.field3736.length - (arg0.field3734 + 10 + 8));
            this.field4029.inflate(arg1);
        } catch (Exception var4) {
            this.field4029.reset();
            throw new RuntimeException("");
        }
        this.field4029.reset();
    }
}
