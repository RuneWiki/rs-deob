package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class65 extends class52 {

    @ObfuscatedName("ba.t")
    public AudioFormat field1194;

    @ObfuscatedName("ba.b")
    public SourceDataLine field1195;

    @ObfuscatedName("ba.ah")
    public int field1196;

    @ObfuscatedName("ba.ae")
    public byte[] field1197;

    @ObfuscatedName("ba.t(Ljava/awt/Component;)V")
    public void method1014(Component arg0) {
        this.field1194 = new AudioFormat((float) Statics.field1106, 16, Statics.field1089 ? 2 : 1, true, false);
        this.field1197 = new byte[0x100 << (Statics.field1089 ? 2 : 1)];
    }

    @ObfuscatedName("ba.b(I)V")
    public void method1015(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1194, arg0 << (Statics.field1089 ? 2 : 1));
            this.field1195 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1195.open();
            this.field1195.start();
            this.field1196 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1195 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1015(var17);
        }
    }

    @ObfuscatedName("ba.p()I")
    public int method1013() {
        return this.field1196 - (this.field1195.available() >> (Statics.field1089 ? 2 : 1));
    }

    @ObfuscatedName("ba.e()V")
    public void method1017() {
        int var1 = 256;
        if (Statics.field1089) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1092[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1197[var2 * 2] = (byte) (var3 >> 8);
            this.field1197[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1195.write(this.field1197, 0, var1 << 1);
    }

    @ObfuscatedName("ba.i()V")
    public void method1019() {
        if (this.field1195 != null) {
            this.field1195.close();
            this.field1195 = null;
        }
    }

    @ObfuscatedName("ba.o()V")
    public void method1018() {
        this.field1195.flush();
    }
}
