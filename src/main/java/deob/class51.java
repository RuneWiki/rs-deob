package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("al")
public class class51 extends class52 {

    @ObfuscatedName("al.b")
    public AudioFormat field1093;

    @ObfuscatedName("al.c")
    public SourceDataLine field1091;

    @ObfuscatedName("al.j")
    public int field1092;

    @ObfuscatedName("al.i")
    public byte[] field1090;

    @ObfuscatedName("al.b(Ljava/awt/Component;)V")
    public void method914(Component arg0) {
        this.field1093 = new AudioFormat((float) Statics.field1117, 16, Statics.field1109 ? 2 : 1, true, false);
        this.field1090 = new byte[0x100 << (Statics.field1109 ? 2 : 1)];
    }

    @ObfuscatedName("al.c(I)V")
    public void method917(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1093, arg0 << (Statics.field1109 ? 2 : 1));
            this.field1091 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1091.open();
            this.field1091.start();
            this.field1092 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1091 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method917(var17);
        }
    }

    @ObfuscatedName("al.j()I")
    public int method916() {
        return this.field1092 - (this.field1091.available() >> (Statics.field1109 ? 2 : 1));
    }

    @ObfuscatedName("al.i()V")
    public void method931() {
        int var1 = 256;
        if (Statics.field1109) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1103[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1090[var2 * 2] = (byte) (var3 >> 8);
            this.field1090[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1091.write(this.field1090, 0, var1 << 1);
    }

    @ObfuscatedName("al.k()V")
    public void method918() {
        if (this.field1091 != null) {
            this.field1091.close();
            this.field1091 = null;
        }
    }

    @ObfuscatedName("al.q()V")
    public void method919() {
        this.field1091.flush();
    }
}
