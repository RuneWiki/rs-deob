package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fr")
public class class174 {

    @ObfuscatedName("fr.m")
    public Inflater field2435;

    public class174() {
        this(-1, 1000000, 1000000);
    }

    public class174(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fr.m(Lfv;[BI)V")
    public void method2946(class181 arg0, byte[] arg1) {
        if (arg0.field2499[arg0.field2498] != 31 || arg0.field2499[arg0.field2498 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2435 == null) {
            this.field2435 = new Inflater(true);
        }
        try {
            this.field2435.setInput(arg0.field2499, arg0.field2498 + 10, arg0.field2499.length - (arg0.field2498 + 10 + 8));
            this.field2435.inflate(arg1);
        } catch (Exception var4) {
            this.field2435.reset();
            throw new RuntimeException("");
        }
        this.field2435.reset();
    }
}
