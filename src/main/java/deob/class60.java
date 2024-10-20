package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bd")
public class class60 extends class58 {

    @ObfuscatedName("bd.aj")
    public AudioFormat field1061;

    @ObfuscatedName("bd.ab")
    public SourceDataLine field1060;

    @ObfuscatedName("bd.af")
    public int field1059;

    @ObfuscatedName("bd.aw")
    public byte[] field1062;

    @ObfuscatedName("bd.w(Ljava/awt/Component;I)V")
    public void method1089(Component arg0) {
        this.field1061 = new AudioFormat((float) Statics.field3080, 16, Statics.field1033 ? 2 : 1, true, false);
        this.field1062 = new byte[0x100 << (Statics.field1033 ? 2 : 1)];
    }

    @ObfuscatedName("bd.m(II)V")
    public void method1090(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1061, arg0 << (Statics.field1033 ? 2 : 1));
            this.field1060 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1060.open();
            this.field1060.start();
            this.field1059 = arg0;
        } catch (LineUnavailableException var11) {
            if (class158.method3144(arg0) == 1) {
                this.field1060 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1090(var10);
        }
    }

    @ObfuscatedName("bd.u(B)I")
    public int method1106() {
        return this.field1059 - (this.field1060.available() >> (Statics.field1033 ? 2 : 1));
    }

    @ObfuscatedName("bd.q()V")
    public void method1092() {
        int var1 = 256;
        if (Statics.field1033) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1028[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1062[var2 * 2] = (byte) (var3 >> 8);
            this.field1062[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1060.write(this.field1062, 0, var1 << 1);
    }

    @ObfuscatedName("bd.c(I)V")
    public void method1084() {
        if (this.field1060 != null) {
            this.field1060.close();
            this.field1060 = null;
        }
    }

    @ObfuscatedName("bd.v(I)V")
    public void method1094() {
        this.field1060.flush();
    }
}
