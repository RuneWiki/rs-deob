package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ab")
public class class27 extends class38 {

    @ObfuscatedName("ab.l")
    public AudioFormat field159;

    @ObfuscatedName("ab.q")
    public SourceDataLine field157;

    @ObfuscatedName("ab.f")
    public int field158;

    @ObfuscatedName("ab.j")
    public byte[] field156;

    @ObfuscatedName("ab.l(I)V")
    public void method378() {
        this.field159 = new AudioFormat((float) Statics.field280, 16, Statics.field274 ? 2 : 1, true, false);
        this.field156 = new byte[0x100 << (Statics.field274 ? 2 : 1)];
    }

    @ObfuscatedName("ab.q(IB)V")
    public void method377(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field159, arg0 << (Statics.field274 ? 2 : 1));
            this.field157 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field157.open();
            this.field157.start();
            this.field158 = arg0;
        } catch (LineUnavailableException var4) {
            if (class246.method3495(arg0) == 1) {
                this.field157 = null;
                throw var4;
            } else {
                this.method377(class246.method2634(arg0));
            }
        }
    }

    @ObfuscatedName("ab.f(I)I")
    public int method387() {
        return this.field158 - (this.field157.available() >> (Statics.field274 ? 2 : 1));
    }

    @ObfuscatedName("ab.j()V")
    public void method380() {
        int var1 = 256;
        if (Statics.field274) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field268[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field156[var2 * 2] = (byte) (var3 >> 8);
            this.field156[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field157.write(this.field156, 0, var1 << 1);
    }

    @ObfuscatedName("ab.m(I)V")
    public void method381() {
        if (this.field157 != null) {
            this.field157.close();
            this.field157 = null;
        }
    }

    @ObfuscatedName("ab.k(B)V")
    public void method383() {
        this.field157.flush();
    }
}
