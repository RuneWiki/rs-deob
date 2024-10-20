package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bz")
public class class70 extends class57 {

    @ObfuscatedName("bz.f")
    public AudioFormat field1302;

    @ObfuscatedName("bz.u")
    public SourceDataLine field1301;

    @ObfuscatedName("bz.ac")
    public int field1300;

    @ObfuscatedName("bz.aj")
    public byte[] field1303;

    @ObfuscatedName("bz.f(Ljava/awt/Component;)V")
    public void method1148(Component arg0) {
        this.field1302 = new AudioFormat((float) Statics.field1197, 16, Statics.field1201 ? 2 : 1, true, false);
        this.field1303 = new byte[0x100 << (Statics.field1201 ? 2 : 1)];
    }

    @ObfuscatedName("bz.u(I)V")
    public void method1159(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1302, arg0 << (Statics.field1201 ? 2 : 1));
            this.field1301 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1301.open();
            this.field1301.start();
            this.field1300 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1301 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1159(var17);
        }
    }

    @ObfuscatedName("bz.x()I")
    public int method1150() {
        return this.field1300 - (this.field1301.available() >> (Statics.field1201 ? 2 : 1));
    }

    @ObfuscatedName("bz.b()V")
    public void method1162() {
        int var1 = 256;
        if (Statics.field1201) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1192[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1303[var2 * 2] = (byte) (var3 >> 8);
            this.field1303[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1301.write(this.field1303, 0, var1 << 1);
    }

    @ObfuscatedName("bz.l()V")
    public void method1152() {
        if (this.field1301 != null) {
            this.field1301.close();
            this.field1301 = null;
        }
    }

    @ObfuscatedName("bz.d()V")
    public void method1153() {
        this.field1301.flush();
    }
}
