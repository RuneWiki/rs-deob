package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("aw")
public class class51 extends class52 {

    @ObfuscatedName("aw.t")
    public AudioFormat field1120;

    @ObfuscatedName("aw.l")
    public SourceDataLine field1119;

    @ObfuscatedName("aw.c")
    public int field1121;

    @ObfuscatedName("aw.d")
    public byte[] field1122;

    @ObfuscatedName("aw.t(Ljava/awt/Component;)V")
    public void method951(Component arg0) {
        this.field1120 = new AudioFormat((float) Statics.field2051, 16, Statics.field2022 ? 2 : 1, true, false);
        this.field1122 = new byte[0x100 << (Statics.field2022 ? 2 : 1)];
    }

    @ObfuscatedName("aw.l(I)V")
    public void method952(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1120, arg0 << (Statics.field2022 ? 2 : 1));
            this.field1119 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1119.open();
            this.field1119.start();
            this.field1121 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1119 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method952(var17);
        }
    }

    @ObfuscatedName("aw.c()I")
    public int method953() {
        return this.field1121 - (this.field1119.available() >> (Statics.field2022 ? 2 : 1));
    }

    @ObfuscatedName("aw.d()V")
    public void method954() {
        int var1 = 256;
        if (Statics.field2022) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1123[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1122[var2 * 2] = (byte) (var3 >> 8);
            this.field1122[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1119.write(this.field1122, 0, var1 << 1);
    }

    @ObfuscatedName("aw.b()V")
    public void method966() {
        if (this.field1119 != null) {
            this.field1119.close();
            this.field1119 = null;
        }
    }

    @ObfuscatedName("aw.i()V")
    public void method956() {
        this.field1119.flush();
    }
}
