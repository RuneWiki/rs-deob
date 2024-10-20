package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ah")
public class class27 extends class40 {

    @ObfuscatedName("ah.c")
    public AudioFormat field168;

    @ObfuscatedName("ah.b")
    public SourceDataLine field166;

    @ObfuscatedName("ah.p")
    public int field167;

    @ObfuscatedName("ah.m")
    public byte[] field165;

    @ObfuscatedName("ah.c(I)V")
    public void method402() {
        this.field168 = new AudioFormat((float) Statics.field4059, 16, Statics.field3178 ? 2 : 1, true, false);
        this.field165 = new byte[0x100 << (Statics.field3178 ? 2 : 1)];
    }

    @ObfuscatedName("ah.b(II)V")
    public void method403(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field168, arg0 << (Statics.field3178 ? 2 : 1));
            this.field166 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field166.open();
            this.field166.start();
            this.field167 = arg0;
        } catch (LineUnavailableException var4) {
            if (class259.method5272(arg0) == 1) {
                this.field166 = null;
                throw var4;
            } else {
                this.method403(class259.method3053(arg0));
            }
        }
    }

    @ObfuscatedName("ah.p(I)I")
    public int method422() {
        return this.field167 - (this.field166.available() >> (Statics.field3178 ? 2 : 1));
    }

    @ObfuscatedName("ah.m()V")
    public void method405() {
        int var1 = 256;
        if (Statics.field3178) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field283[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field165[var2 * 2] = (byte) (var3 >> 8);
            this.field165[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field166.write(this.field165, 0, var1 << 1);
    }

    @ObfuscatedName("ah.t(B)V")
    public void method406() {
        if (this.field166 != null) {
            this.field166.close();
            this.field166 = null;
        }
    }

    @ObfuscatedName("ah.s(I)V")
    public void method407() {
        this.field166.flush();
    }
}
