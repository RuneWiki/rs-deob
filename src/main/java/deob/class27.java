package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aq")
public class class27 extends class38 {

    @ObfuscatedName("aq.n")
    public AudioFormat field166;

    @ObfuscatedName("aq.c")
    public SourceDataLine field165;

    @ObfuscatedName("aq.m")
    public int field164;

    @ObfuscatedName("aq.k")
    public byte[] field167;

    @ObfuscatedName("aq.n(B)V")
    public void method373() {
        this.field166 = new AudioFormat((float) Statics.field3288, 16, Statics.field274 ? 2 : 1, true, false);
        this.field167 = new byte[0x100 << (Statics.field274 ? 2 : 1)];
    }

    @ObfuscatedName("aq.c(IB)V")
    public void method374(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field166, arg0 << (Statics.field274 ? 2 : 1));
            this.field165 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field165.open();
            this.field165.start();
            this.field164 = arg0;
        } catch (LineUnavailableException var4) {
            if (class246.method2094(arg0) == 1) {
                this.field165 = null;
                throw var4;
            } else {
                this.method374(class246.method1937(arg0));
            }
        }
    }

    @ObfuscatedName("aq.m(B)I")
    public int method375() {
        return this.field164 - (this.field165.available() >> (Statics.field274 ? 2 : 1));
    }

    @ObfuscatedName("aq.k()V")
    public void method381() {
        int var1 = 256;
        if (Statics.field274) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field270[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field167[var2 * 2] = (byte) (var3 >> 8);
            this.field167[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field165.write(this.field167, 0, var1 << 1);
    }

    @ObfuscatedName("aq.o(B)V")
    public void method377() {
        if (this.field165 != null) {
            this.field165.close();
            this.field165 = null;
        }
    }

    @ObfuscatedName("aq.g(I)V")
    public void method378() {
        this.field165.flush();
    }
}
