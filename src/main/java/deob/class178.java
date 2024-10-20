package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fo")
public class class178 {

    @ObfuscatedName("fo.g")
    public Inflater field2347;

    public class178() {
        this(-1, 1000000, 1000000);
    }

    public class178(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fo.g(Lgl;[BB)V")
    public void method3393(class185 arg0, byte[] arg1) {
        if (arg0.field2405[arg0.field2406] != 31 || arg0.field2405[arg0.field2406 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2347 == null) {
            this.field2347 = new Inflater(true);
        }
        try {
            this.field2347.setInput(arg0.field2405, arg0.field2406 + 10, arg0.field2405.length - (arg0.field2406 + 10 + 8));
            this.field2347.inflate(arg1);
        } catch (Exception var4) {
            this.field2347.reset();
            throw new RuntimeException("");
        }
        this.field2347.reset();
    }
}
