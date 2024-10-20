package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bg")
public class class60 extends class115 {

    @ObfuscatedName("bg.x")
    public AudioFormat field459;

    @ObfuscatedName("bg.m")
    public SourceDataLine field461;

    @ObfuscatedName("bg.k")
    public int field460;

    @ObfuscatedName("bg.d")
    public byte[] field458;

    @ObfuscatedName("bg.x(I)V")
    public void method814() {
        this.field459 = new AudioFormat((float) Statics.field1422, 16, Statics.field1438 ? 2 : 1, true, false);
        this.field458 = new byte[0x100 << (Statics.field1438 ? 2 : 1)];
    }

    @ObfuscatedName("bg.m(II)V")
    public void method815(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field459, arg0 << (Statics.field1438 ? 2 : 1));
            this.field461 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field461.open();
            this.field461.start();
            this.field460 = arg0;
        } catch (LineUnavailableException var4) {
            if (class198.method3280(arg0) == 1) {
                this.field461 = null;
                throw var4;
            } else {
                this.method815(class198.method3666(arg0));
            }
        }
    }

    @ObfuscatedName("bg.k(I)I")
    public int method816() {
        return this.field460 - (this.field461.available() >> (Statics.field1438 ? 2 : 1));
    }

    @ObfuscatedName("bg.d()V")
    public void method817() {
        int var1 = 256;
        if (Statics.field1438) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1427[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field458[var2 * 2] = (byte) (var3 >> 8);
            this.field458[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field461.write(this.field458, 0, var1 << 1);
    }

    @ObfuscatedName("bg.w(B)V")
    public void method818() {
        if (this.field461 != null) {
            this.field461.close();
            this.field461 = null;
        }
    }

    @ObfuscatedName("bg.v(I)V")
    public void method819() {
        this.field461.flush();
    }
}
