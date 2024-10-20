package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class56 extends class108 {

    @ObfuscatedName("bc.d")
    public AudioFormat field691;

    @ObfuscatedName("bc.k")
    public SourceDataLine field692;

    @ObfuscatedName("bc.e")
    public int field694;

    @ObfuscatedName("bc.p")
    public byte[] field693;

    @ObfuscatedName("bc.d(B)V")
    public void method724() {
        this.field691 = new AudioFormat((float) Statics.field463, 16, Statics.field491 ? 2 : 1, true, false);
        this.field693 = new byte[0x100 << (Statics.field491 ? 2 : 1)];
    }

    @ObfuscatedName("bc.k(II)V")
    public void method715(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field691, arg0 << (Statics.field491 ? 2 : 1));
            this.field692 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field692.open();
            this.field692.start();
            this.field694 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method91(arg0) == 1) {
                this.field692 = null;
                throw var4;
            } else {
                this.method715(class178.method1636(arg0));
            }
        }
    }

    @ObfuscatedName("bc.e(B)I")
    public int method716() {
        return this.field694 - (this.field692.available() >> (Statics.field491 ? 2 : 1));
    }

    @ObfuscatedName("bc.p()V")
    public void method726() {
        int var1 = 256;
        if (Statics.field491) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1625[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field693[var2 * 2] = (byte) (var3 >> 8);
            this.field693[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field692.write(this.field693, 0, var1 << 1);
    }

    @ObfuscatedName("bc.q(I)V")
    public void method718() {
        if (this.field692 != null) {
            this.field692.close();
            this.field692 = null;
        }
    }

    @ObfuscatedName("bc.s(I)V")
    public void method719() {
        this.field692.flush();
    }
}
