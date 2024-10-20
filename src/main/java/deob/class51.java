package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("an")
public class class51 extends class52 {

    @ObfuscatedName("an.i")
    public AudioFormat field1092;

    @ObfuscatedName("an.p")
    public SourceDataLine field1095;

    @ObfuscatedName("an.a")
    public int field1094;

    @ObfuscatedName("an.l")
    public byte[] field1093;

    @ObfuscatedName("an.i(Ljava/awt/Component;)V")
    public void method912(Component arg0) {
        this.field1092 = new AudioFormat((float) Statics.field763, 16, Statics.field2711 ? 2 : 1, true, false);
        this.field1093 = new byte[0x100 << (Statics.field2711 ? 2 : 1)];
    }

    @ObfuscatedName("an.p(I)V")
    public void method895(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1092, arg0 << (Statics.field2711 ? 2 : 1));
            this.field1095 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1095.open();
            this.field1095.start();
            this.field1094 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1095 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method895(var17);
        }
    }

    @ObfuscatedName("an.a()I")
    public int method896() {
        return this.field1094 - (this.field1095.available() >> (Statics.field2711 ? 2 : 1));
    }

    @ObfuscatedName("an.l()V")
    public void method897() {
        int var1 = 256;
        if (Statics.field2711) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1098[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1093[var2 * 2] = (byte) (var3 >> 8);
            this.field1093[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1095.write(this.field1093, 0, var1 << 1);
    }

    @ObfuscatedName("an.q()V")
    public void method898() {
        if (this.field1095 != null) {
            this.field1095.close();
            this.field1095 = null;
        }
    }

    @ObfuscatedName("an.b()V")
    public void method899() {
        this.field1095.flush();
    }
}
