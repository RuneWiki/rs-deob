package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fq")
public class class178 {

    @ObfuscatedName("fq.c")
    public Inflater field2322;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fq.c(Lgg;[BB)V")
    public void method3173(class185 arg0, byte[] arg1) {
        if (arg0.field2388[arg0.field2386] != 31 || arg0.field2388[arg0.field2386 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2322 == null) {
            this.field2322 = new Inflater(true);
        }
        try {
            this.field2322.setInput(arg0.field2388, arg0.field2386 + 10, arg0.field2388.length - (arg0.field2386 + 10 + 8));
            this.field2322.inflate(arg1);
        } catch (Exception var4) {
            this.field2322.reset();
            throw new RuntimeException("");
        }
        this.field2322.reset();
    }
}
