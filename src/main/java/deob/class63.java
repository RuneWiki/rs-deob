package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bk")
public class class63 extends class50 {

    @ObfuscatedName("bk.k")
    public AudioFormat field1185;

    @ObfuscatedName("bk.r")
    public SourceDataLine field1183;

    @ObfuscatedName("bk.aw")
    public int field1184;

    @ObfuscatedName("bk.ai")
    public byte[] field1182;

    @ObfuscatedName("bk.k(Ljava/awt/Component;)V")
    public void method950(Component arg0) {
        this.field1185 = new AudioFormat((float) Statics.field1096, 16, Statics.field1092 ? 2 : 1, true, false);
        this.field1182 = new byte[0x100 << (Statics.field1092 ? 2 : 1)];
    }

    @ObfuscatedName("bk.r(I)V")
    public void method951(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1185, arg0 << (Statics.field1092 ? 2 : 1));
            this.field1183 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1183.open();
            this.field1183.start();
            this.field1184 = arg0;
        } catch (LineUnavailableException var11) {
            if (class113.method841(arg0) == 1) {
                this.field1183 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method951(var10);
        }
    }

    @ObfuscatedName("bk.y()I")
    public int method952() {
        return this.field1184 - (this.field1183.available() >> (Statics.field1092 ? 2 : 1));
    }

    @ObfuscatedName("bk.w()V")
    public void method953() {
        int var1 = 256;
        if (Statics.field1092) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1079[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1182[var2 * 2] = (byte) (var3 >> 8);
            this.field1182[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1183.write(this.field1182, 0, var1 << 1);
    }

    @ObfuscatedName("bk.m()V")
    public void method954() {
        if (this.field1183 != null) {
            this.field1183.close();
            this.field1183 = null;
        }
    }

    @ObfuscatedName("bk.j()V")
    public void method961() {
        this.field1183.flush();
    }
}
