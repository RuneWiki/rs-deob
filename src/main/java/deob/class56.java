package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class56 extends class110 {

    @ObfuscatedName("bv.p")
    public AudioFormat field678;

    @ObfuscatedName("bv.m")
    public SourceDataLine field679;

    @ObfuscatedName("bv.e")
    public int field680;

    @ObfuscatedName("bv.t")
    public byte[] field681;

    @ObfuscatedName("bv.p(I)V")
    public void method681() {
        this.field678 = new AudioFormat((float) Statics.field1636, 16, Statics.field2850 ? 2 : 1, true, false);
        this.field681 = new byte[0x100 << (Statics.field2850 ? 2 : 1)];
    }

    @ObfuscatedName("bv.m(II)V")
    public void method683(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field678, arg0 << (Statics.field2850 ? 2 : 1));
            this.field679 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field679.open();
            this.field679.start();
            this.field680 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method2403(arg0) == 1) {
                this.field679 = null;
                throw var4;
            } else {
                this.method683(class178.method3692(arg0));
            }
        }
    }

    @ObfuscatedName("bv.e(I)I")
    public int method682() {
        return this.field680 - (this.field679.available() >> (Statics.field2850 ? 2 : 1));
    }

    @ObfuscatedName("bv.t()V")
    public void method694() {
        int var1 = 256;
        if (Statics.field2850) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1640[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field681[var2 * 2] = (byte) (var3 >> 8);
            this.field681[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field679.write(this.field681, 0, var1 << 1);
    }

    @ObfuscatedName("bv.w(I)V")
    public void method685() {
        if (this.field679 != null) {
            this.field679.close();
            this.field679 = null;
        }
    }

    @ObfuscatedName("bv.z(B)V")
    public void method686() {
        this.field679.flush();
    }
}
