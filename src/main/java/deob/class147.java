package deob;

import java.util.zip.Inflater;

@ObfuscatedName("eq")
public class class147 {

    @ObfuscatedName("eq.u")
    public Inflater field2007;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eq.u(Len;[BI)V")
    public void method2526(class154 arg0, byte[] arg1) {
        if (arg0.field2078[arg0.field2073] != 31 || arg0.field2078[arg0.field2073 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2007 == null) {
            this.field2007 = new Inflater(true);
        }
        try {
            this.field2007.setInput(arg0.field2078, arg0.field2073 + 10, arg0.field2078.length - (arg0.field2073 + 10 + 8));
            this.field2007.inflate(arg1);
        } catch (Exception var4) {
            this.field2007.reset();
            throw new RuntimeException("");
        }
        this.field2007.reset();
    }
}
