package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ea")
public class class147 {

    @ObfuscatedName("ea.b")
    public Inflater field2009;

    public class147() {
        this(-1, 1000000, 1000000);
    }

    public class147(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ea.b(Lec;[BI)V")
    public void method2604(class154 arg0, byte[] arg1) {
        if (arg0.field2084[arg0.field2079] != 31 || arg0.field2084[arg0.field2079 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2009 == null) {
            this.field2009 = new Inflater(true);
        }
        try {
            this.field2009.setInput(arg0.field2084, arg0.field2079 + 10, arg0.field2084.length - (arg0.field2079 + 10 + 8));
            this.field2009.inflate(arg1);
        } catch (Exception var4) {
            this.field2009.reset();
            throw new RuntimeException("");
        }
        this.field2009.reset();
    }
}
