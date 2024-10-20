package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ad")
public class class27 extends class40 {

    @ObfuscatedName("ad.c")
    public AudioFormat field163;

    @ObfuscatedName("ad.v")
    public SourceDataLine field164;

    @ObfuscatedName("ad.q")
    public int field162;

    @ObfuscatedName("ad.f")
    public byte[] field165;

    @ObfuscatedName("ad.c(I)V")
    public void method338() {
        this.field163 = new AudioFormat((float) Statics.field288, 16, Statics.field1414 ? 2 : 1, true, false);
        this.field165 = new byte[0x100 << (Statics.field1414 ? 2 : 1)];
    }

    @ObfuscatedName("ad.v(II)V")
    public void method321(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field163, arg0 << (Statics.field1414 ? 2 : 1));
            this.field164 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field164.open();
            this.field164.start();
            this.field162 = arg0;
        } catch (LineUnavailableException var4) {
            if (class271.method4738(arg0) == 1) {
                this.field164 = null;
                throw var4;
            } else {
                this.method321(class271.method2726(arg0));
            }
        }
    }

    @ObfuscatedName("ad.q(I)I")
    public int method324() {
        return this.field162 - (this.field164.available() >> (Statics.field1414 ? 2 : 1));
    }

    @ObfuscatedName("ad.f()V")
    public void method320() {
        int var1 = 256;
        if (Statics.field1414) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field278[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field165[var2 * 2] = (byte) (var3 >> 8);
            this.field165[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field164.write(this.field165, 0, var1 << 1);
    }

    @ObfuscatedName("ad.j(B)V")
    public void method327() {
        if (this.field164 != null) {
            this.field164.close();
            this.field164 = null;
        }
    }

    @ObfuscatedName("ad.e(B)V")
    public void method325() {
        this.field164.flush();
    }
}
