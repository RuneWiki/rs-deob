package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bu")
public class class70 extends class57 {

    @ObfuscatedName("bu.o")
    public AudioFormat field1279;

    @ObfuscatedName("bu.e")
    public SourceDataLine field1280;

    @ObfuscatedName("bu.ay")
    public int field1278;

    @ObfuscatedName("bu.ak")
    public byte[] field1281;

    @ObfuscatedName("bu.o(Ljava/awt/Component;)V")
    public void method1067(Component arg0) {
        this.field1279 = new AudioFormat((float) Statics.field2641, 16, Statics.field1182 ? 2 : 1, true, false);
        this.field1281 = new byte[0x100 << (Statics.field1182 ? 2 : 1)];
    }

    @ObfuscatedName("bu.e(I)V")
    public void method1068(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1279, arg0 << (Statics.field1182 ? 2 : 1));
            this.field1280 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1280.open();
            this.field1280.start();
            this.field1278 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1280 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1068(var17);
        }
    }

    @ObfuscatedName("bu.u()I")
    public int method1069() {
        return this.field1278 - (this.field1280.available() >> (Statics.field1182 ? 2 : 1));
    }

    @ObfuscatedName("bu.b()V")
    public void method1070() {
        int var1 = 256;
        if (Statics.field1182) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1168[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1281[var2 * 2] = (byte) (var3 >> 8);
            this.field1281[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1280.write(this.field1281, 0, var1 << 1);
    }

    @ObfuscatedName("bu.p()V")
    public void method1066() {
        if (this.field1280 != null) {
            this.field1280.close();
            this.field1280 = null;
        }
    }

    @ObfuscatedName("bu.s()V")
    public void method1072() {
        this.field1280.flush();
    }
}
