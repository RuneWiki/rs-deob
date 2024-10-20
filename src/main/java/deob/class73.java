package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bu")
public class class73 extends class60 {

    @ObfuscatedName("bu.ah")
    public AudioFormat field1327;

    @ObfuscatedName("bu.am")
    public SourceDataLine field1328;

    @ObfuscatedName("bu.aa")
    public int field1326;

    @ObfuscatedName("bu.ax")
    public byte[] field1329;

    @ObfuscatedName("bu.r(Ljava/awt/Component;I)V")
    public void method1207(Component arg0) {
        this.field1327 = new AudioFormat((float) Statics.field1220, 16, Statics.field1223 ? 2 : 1, true, false);
        this.field1329 = new byte[0x100 << (Statics.field1223 ? 2 : 1)];
    }

    @ObfuscatedName("bu.w(II)V")
    public void method1170(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1327, arg0 << (Statics.field1223 ? 2 : 1));
            this.field1328 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1328.open();
            this.field1328.start();
            this.field1326 = arg0;
        } catch (LineUnavailableException var11) {
            if (class130.method585(arg0) == 1) {
                this.field1328 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1170(var10);
        }
    }

    @ObfuscatedName("bu.u(I)I")
    public int method1176() {
        return this.field1326 - (this.field1328.available() >> (Statics.field1223 ? 2 : 1));
    }

    @ObfuscatedName("bu.n()V")
    public void method1162() {
        int var1 = 256;
        if (Statics.field1223) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1241[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1329[var2 * 2] = (byte) (var3 >> 8);
            this.field1329[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1328.write(this.field1329, 0, var1 << 1);
    }

    @ObfuscatedName("bu.d(I)V")
    public void method1172() {
        if (this.field1328 != null) {
            this.field1328.close();
            this.field1328 = null;
        }
    }

    @ObfuscatedName("bu.a(I)V")
    public void method1204() {
        this.field1328.flush();
    }
}
