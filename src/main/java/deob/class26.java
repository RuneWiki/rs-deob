package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("w")
public class class26 extends class44 {

    @ObfuscatedName("w.h")
    public AudioFormat field141;

    @ObfuscatedName("w.e")
    public SourceDataLine field143;

    @ObfuscatedName("w.v")
    public int field142;

    @ObfuscatedName("w.x")
    public byte[] field140;

    @ObfuscatedName("w.h(I)V")
    public void method316() {
        this.field141 = new AudioFormat((float) Statics.field326, 16, Statics.field3355 ? 2 : 1, true, false);
        this.field140 = new byte[0x100 << (Statics.field3355 ? 2 : 1)];
    }

    @ObfuscatedName("w.e(IB)V")
    public void method317(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field141, arg0 << (Statics.field3355 ? 2 : 1));
            this.field143 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field143.open();
            this.field143.start();
            this.field142 = arg0;
        } catch (LineUnavailableException var4) {
            if (class285.method4442(arg0) == 1) {
                this.field143 = null;
                throw var4;
            } else {
                this.method317(class285.method7578(arg0));
            }
        }
    }

    @ObfuscatedName("w.v(B)I")
    public int method338() {
        return this.field142 - (this.field143.available() >> (Statics.field3355 ? 2 : 1));
    }

    @ObfuscatedName("w.x()V")
    public void method319() {
        int var1 = 256;
        if (Statics.field3355) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field333[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field140[var2 * 2] = (byte) (var3 >> 8);
            this.field140[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field143.write(this.field140, 0, var1 << 1);
    }

    @ObfuscatedName("w.m(B)V")
    public void method340() {
        if (this.field143 != null) {
            this.field143.close();
            this.field143 = null;
        }
    }

    @ObfuscatedName("w.q(I)V")
    public void method321() {
        this.field143.flush();
    }
}
