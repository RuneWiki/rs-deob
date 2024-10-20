package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class65 extends class52 {

    @ObfuscatedName("bq.q")
    public AudioFormat field1186;

    @ObfuscatedName("bq.s")
    public SourceDataLine field1185;

    @ObfuscatedName("bq.ae")
    public int field1187;

    @ObfuscatedName("bq.aq")
    public byte[] field1184;

    @ObfuscatedName("bq.q(Ljava/awt/Component;)V")
    public void method942(Component arg0) {
        this.field1186 = new AudioFormat((float) Statics.field3011, 16, Statics.field1081 ? 2 : 1, true, false);
        this.field1184 = new byte[0x100 << (Statics.field1081 ? 2 : 1)];
    }

    @ObfuscatedName("bq.s(I)V")
    public void method959(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1186, arg0 << (Statics.field1081 ? 2 : 1));
            this.field1185 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1185.open();
            this.field1185.start();
            this.field1187 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1185 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method959(var17);
        }
    }

    @ObfuscatedName("bq.h()I")
    public int method944() {
        return this.field1187 - (this.field1185.available() >> (Statics.field1081 ? 2 : 1));
    }

    @ObfuscatedName("bq.e()V")
    public void method945() {
        int var1 = 256;
        if (Statics.field1081) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1083[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1184[var2 * 2] = (byte) (var3 >> 8);
            this.field1184[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1185.write(this.field1184, 0, var1 << 1);
    }

    @ObfuscatedName("bq.n()V")
    public void method960() {
        if (this.field1185 != null) {
            this.field1185.close();
            this.field1185 = null;
        }
    }

    @ObfuscatedName("bq.t()V")
    public void method946() {
        this.field1185.flush();
    }
}
