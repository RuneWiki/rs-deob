package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bn")
public class class56 extends class111 {

    @ObfuscatedName("bn.j")
    public AudioFormat field675;

    @ObfuscatedName("bn.h")
    public SourceDataLine field676;

    @ObfuscatedName("bn.f")
    public int field677;

    @ObfuscatedName("bn.p")
    public byte[] field678;

    @ObfuscatedName("bn.j(B)V")
    public void method725() {
        this.field675 = new AudioFormat((float) Statics.field1652, 16, Statics.field2004 ? 2 : 1, true, false);
        this.field678 = new byte[0x100 << (Statics.field2004 ? 2 : 1)];
    }

    @ObfuscatedName("bn.h(II)V")
    public void method726(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field675, arg0 << (Statics.field2004 ? 2 : 1));
            this.field676 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field676.open();
            this.field676.start();
            this.field677 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field676 = null;
                throw var11;
            } else {
                this.method726(Statics.method2764(arg0));
            }
        }
    }

    @ObfuscatedName("bn.f(I)I")
    public int method727() {
        return this.field677 - (this.field676.available() >> (Statics.field2004 ? 2 : 1));
    }

    @ObfuscatedName("bn.p()V")
    public void method728() {
        int var1 = 256;
        if (Statics.field2004) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1635[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field678[var2 * 2] = (byte) (var3 >> 8);
            this.field678[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field676.write(this.field678, 0, var1 << 1);
    }

    @ObfuscatedName("bn.x(I)V")
    public void method724() {
        if (this.field676 != null) {
            this.field676.close();
            this.field676 = null;
        }
    }

    @ObfuscatedName("bn.g(I)V")
    public void method741() {
        this.field676.flush();
    }
}
