package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("h")
public class class18 {

    @ObfuscatedName("h.o")
    public int field242;

    @ObfuscatedName("h.l")
    public class138 field244;

    @ObfuscatedName("h.g")
    public DataInputStream field240;

    @ObfuscatedName("h.u")
    public byte[] field243 = new byte[4];

    @ObfuscatedName("h.q")
    public int field241;

    @ObfuscatedName("h.r")
    public byte[] field245;

    @ObfuscatedName("h.v")
    public int field246;

    @ObfuscatedName("h.y")
    public long field247;

    public class18(class128 arg0, URL arg1) {
        this.field244 = arg0.method2617(arg1);
        this.field242 = 0;
        this.field247 = class107.method2661() + 30000L;
    }

    @ObfuscatedName("h.o(I)[B")
    public byte[] method176() throws IOException {
        if (class107.method2661() > this.field247) {
            throw new IOException();
        }
        if (this.field242 == 0) {
            if (this.field244.field2105 == 2) {
                throw new IOException();
            }
            if (this.field244.field2105 == 1) {
                this.field240 = (DataInputStream) this.field244.field2101;
                this.field242 = 1;
            }
        }
        if (this.field242 == 1) {
            int var1 = this.field240.available();
            if (var1 > 0) {
                if (this.field241 + var1 > 4) {
                    var1 = 4 - this.field241;
                }
                this.field241 += this.field240.read(this.field243, this.field241, var1);
                if (this.field241 == 4) {
                    int var2 = (new class111(this.field243)).method2273();
                    this.field245 = new byte[var2];
                    this.field242 = 2;
                }
            }
        }
        if (this.field242 == 2) {
            int var3 = this.field240.available();
            if (var3 > 0) {
                if (this.field246 + var3 > this.field245.length) {
                    var3 = this.field245.length - this.field246;
                }
                this.field246 += this.field240.read(this.field245, this.field246, var3);
                if (this.field246 == this.field245.length) {
                    return this.field245;
                }
            }
        }
        return null;
    }
}
