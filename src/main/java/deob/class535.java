package deob;

import java.util.zip.Inflater;

@ObfuscatedName("us")
public class class535 {

    @ObfuscatedName("us.au")
    public Inflater field5251;

    public class535() {
        this(-1, 1000000, 1000000);
    }

    public class535(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("us.au(Ltm;[BI)V")
    public void method8904(class515 arg0, byte[] arg1) {
        if (arg0.field5108[arg0.field5111] != 31 || arg0.field5108[arg0.field5111 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5251 == null) {
            this.field5251 = new Inflater(true);
        }
        try {
            this.field5251.setInput(arg0.field5108, arg0.field5111 + 10, arg0.field5108.length - (arg0.field5111 + 10 + 8));
            this.field5251.inflate(arg1);
        } catch (Exception var4) {
            this.field5251.reset();
            throw new RuntimeException("");
        }
        this.field5251.reset();
    }
}
