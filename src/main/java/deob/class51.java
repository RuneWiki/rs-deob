package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ar")
public class class51 extends class52 {

    @ObfuscatedName("ar.c")
    public AudioFormat field1107;

    @ObfuscatedName("ar.q")
    public SourceDataLine field1108;

    @ObfuscatedName("ar.y")
    public int field1106;

    @ObfuscatedName("ar.v")
    public byte[] field1105;

    @ObfuscatedName("ar.c(Ljava/awt/Component;)V")
    public void method891(Component arg0) {
        this.field1107 = new AudioFormat((float) Statics.field1118, 16, Statics.field1110 ? 2 : 1, true, false);
        this.field1105 = new byte[0x100 << (Statics.field1110 ? 2 : 1)];
    }

    @ObfuscatedName("ar.q(I)V")
    public void method897(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1107, arg0 << (Statics.field1110 ? 2 : 1));
            this.field1108 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1108.open();
            this.field1108.start();
            this.field1106 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1108 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method897(var17);
        }
    }

    @ObfuscatedName("ar.y()I")
    public int method893() {
        return this.field1106 - (this.field1108.available() >> (Statics.field1110 ? 2 : 1));
    }

    @ObfuscatedName("ar.v()V")
    public void method894() {
        int var1 = 256;
        if (Statics.field1110) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1112[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1105[var2 * 2] = (byte) (var3 >> 8);
            this.field1105[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1108.write(this.field1105, 0, var1 << 1);
    }

    @ObfuscatedName("ar.g()V")
    public void method899() {
        if (this.field1108 != null) {
            this.field1108.close();
            this.field1108 = null;
        }
    }

    @ObfuscatedName("ar.x()V")
    public void method896() {
        this.field1108.flush();
    }
}
