package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bp")
public class class70 extends class57 {

    @ObfuscatedName("bp.d")
    public AudioFormat field1287;

    @ObfuscatedName("bp.p")
    public SourceDataLine field1286;

    @ObfuscatedName("bp.ah")
    public int field1285;

    @ObfuscatedName("bp.al")
    public byte[] field1288;

    @ObfuscatedName("bp.d(Ljava/awt/Component;)V")
    public void method1098(Component arg0) {
        this.field1287 = new AudioFormat((float) Statics.field1177, 16, Statics.field1186 ? 2 : 1, true, false);
        this.field1288 = new byte[0x100 << (Statics.field1186 ? 2 : 1)];
    }

    @ObfuscatedName("bp.p(I)V")
    public void method1103(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1287, arg0 << (Statics.field1186 ? 2 : 1));
            this.field1286 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1286.open();
            this.field1286.start();
            this.field1285 = arg0;
        } catch (LineUnavailableException var4) {
            if (Statics.method3545(arg0) == 1) {
                this.field1286 = null;
                throw var4;
            } else {
                this.method1103(class126.method586(arg0));
            }
        }
    }

    @ObfuscatedName("bp.v()I")
    public int method1101() {
        return this.field1285 - (this.field1286.available() >> (Statics.field1186 ? 2 : 1));
    }

    @ObfuscatedName("bp.l()V")
    public void method1110() {
        int var1 = 256;
        if (Statics.field1186) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1180[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1288[var2 * 2] = (byte) (var3 >> 8);
            this.field1288[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1286.write(this.field1288, 0, var1 << 1);
    }

    @ObfuscatedName("bp.y()V")
    public void method1102() {
        if (this.field1286 != null) {
            this.field1286.close();
            this.field1286 = null;
        }
    }

    @ObfuscatedName("bp.w()V")
    public void method1097() {
        this.field1286.flush();
    }
}
