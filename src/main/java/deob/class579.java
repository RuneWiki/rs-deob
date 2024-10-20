package deob;

import java.util.zip.Inflater;

@ObfuscatedName("wq")
public class class579 {

    @ObfuscatedName("wq.ap")
    public Inflater field5624;

    public class579() {
        this(-1, 1000000, 1000000);
    }

    public class579(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("wq.ap(Lvl;[BB)V")
    public void method9970(class558 arg0, byte[] arg1) {
        if (arg0.field5463[arg0.field5462] != 31 || arg0.field5463[arg0.field5462 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5624 == null) {
            this.field5624 = new Inflater(true);
        }
        try {
            this.field5624.setInput(arg0.field5463, arg0.field5462 + 10, arg0.field5463.length - (arg0.field5462 + 10 + 8));
            this.field5624.inflate(arg1);
        } catch (Exception var4) {
            this.field5624.reset();
            throw new RuntimeException("");
        }
        this.field5624.reset();
    }
}
