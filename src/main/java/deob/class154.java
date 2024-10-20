package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ef")
public class class154 {

    @ObfuscatedName("ef.k")
    public Inflater field2195;

    public class154() {
        this(-1, 1000000, 1000000);
    }

    public class154(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ef.k(Lfm;[BB)V")
    public void method2666(class161 arg0, byte[] arg1) {
        if (arg0.field2258[arg0.field2267] != 31 || arg0.field2258[arg0.field2267 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2195 == null) {
            this.field2195 = new Inflater(true);
        }
        try {
            this.field2195.setInput(arg0.field2258, arg0.field2267 + 10, arg0.field2258.length - (arg0.field2267 + 10 + 8));
            this.field2195.inflate(arg1);
        } catch (Exception var4) {
            this.field2195.reset();
            throw new RuntimeException("");
        }
        this.field2195.reset();
    }
}
