package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("k")
public class class14 extends class25 {

    @ObfuscatedName("k.s")
    public AudioFormat field81;

    @ObfuscatedName("k.t")
    public SourceDataLine field83;

    @ObfuscatedName("k.v")
    public int field82;

    @ObfuscatedName("k.j")
    public byte[] field84;

    @ObfuscatedName("k.s(I)V")
    public void method131() {
        this.field81 = new AudioFormat((float) Statics.field3634, 16, Statics.field199 ? 2 : 1, true, false);
        this.field84 = new byte[0x100 << (Statics.field199 ? 2 : 1)];
    }

    @ObfuscatedName("k.t(IB)V")
    public void method140(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field81, arg0 << (Statics.field199 ? 2 : 1));
            this.field83 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field83.open();
            this.field83.start();
            this.field82 = arg0;
        } catch (LineUnavailableException var4) {
            if (class233.method2269(arg0) == 1) {
                this.field83 = null;
                throw var4;
            } else {
                this.method140(class233.method506(arg0));
            }
        }
    }

    @ObfuscatedName("k.v(B)I")
    public int method125() {
        return this.field82 - (this.field83.available() >> (Statics.field199 ? 2 : 1));
    }

    @ObfuscatedName("k.j()V")
    public void method126() {
        int var1 = 256;
        if (Statics.field199) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field183[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field84[var2 * 2] = (byte) (var3 >> 8);
            this.field84[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field83.write(this.field84, 0, var1 << 1);
    }

    @ObfuscatedName("k.l(I)V")
    public void method127() {
        if (this.field83 != null) {
            this.field83.close();
            this.field83 = null;
        }
    }

    @ObfuscatedName("k.n(I)V")
    public void method128() {
        this.field83.flush();
    }
}
