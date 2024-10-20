package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class64 extends class51 {

    @ObfuscatedName("bf.x")
    public AudioFormat field1200;

    @ObfuscatedName("bf.v")
    public SourceDataLine field1198;

    @ObfuscatedName("bf.ag")
    public int field1199;

    @ObfuscatedName("bf.am")
    public byte[] field1197;

    @ObfuscatedName("bf.x(Ljava/awt/Component;)V")
    public void method963(Component arg0) {
        this.field1200 = new AudioFormat((float) Statics.field1096, 16, Statics.field1092 ? 2 : 1, true, false);
        this.field1197 = new byte[0x100 << (Statics.field1092 ? 2 : 1)];
    }

    @ObfuscatedName("bf.v(I)V")
    public void method952(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1200, arg0 << (Statics.field1092 ? 2 : 1));
            this.field1198 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1198.open();
            this.field1198.start();
            this.field1199 = arg0;
        } catch (LineUnavailableException var11) {
            if (class115.method97(arg0) == 1) {
                this.field1198 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method952(var10);
        }
    }

    @ObfuscatedName("bf.m()I")
    public int method953() {
        return this.field1199 - (this.field1198.available() >> (Statics.field1092 ? 2 : 1));
    }

    @ObfuscatedName("bf.e()V")
    public void method964() {
        int var1 = 256;
        if (Statics.field1092) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1087[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1197[var2 * 2] = (byte) (var3 >> 8);
            this.field1197[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1198.write(this.field1197, 0, var1 << 1);
    }

    @ObfuscatedName("bf.h()V")
    public void method955() {
        if (this.field1198 != null) {
            this.field1198.close();
            this.field1198 = null;
        }
    }

    @ObfuscatedName("bf.p()V")
    public void method950() {
        this.field1198.flush();
    }
}
