package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class27 extends class40 {

    @ObfuscatedName("ap.c")
    public AudioFormat field168;

    @ObfuscatedName("ap.l")
    public SourceDataLine field167;

    @ObfuscatedName("ap.s")
    public int field169;

    @ObfuscatedName("ap.e")
    public byte[] field166;

    @ObfuscatedName("ap.c(B)V")
    public void method370() {
        this.field168 = new AudioFormat((float) Statics.field306, 16, Statics.field290 ? 2 : 1, true, false);
        this.field166 = new byte[0x100 << (Statics.field290 ? 2 : 1)];
    }

    @ObfuscatedName("ap.l(II)V")
    public void method368(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field168, arg0 << (Statics.field290 ? 2 : 1));
            this.field167 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field167.open();
            this.field167.start();
            this.field169 = arg0;
        } catch (LineUnavailableException var4) {
            if (class264.method66(arg0) == 1) {
                this.field167 = null;
                throw var4;
            } else {
                this.method368(class264.method5144(arg0));
            }
        }
    }

    @ObfuscatedName("ap.s(B)I")
    public int method380() {
        return this.field169 - (this.field167.available() >> (Statics.field290 ? 2 : 1));
    }

    @ObfuscatedName("ap.e()V")
    public void method372() {
        int var1 = 256;
        if (Statics.field290) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field292[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field166[var2 * 2] = (byte) (var3 >> 8);
            this.field166[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field167.write(this.field166, 0, var1 << 1);
    }

    @ObfuscatedName("ap.r(I)V")
    public void method373() {
        if (this.field167 != null) {
            this.field167.close();
            this.field167 = null;
        }
    }

    @ObfuscatedName("ap.o(B)V")
    public void method387() {
        this.field167.flush();
    }
}
