package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.p")
    public int field224;

    @ObfuscatedName("b.y")
    public class137 field218;

    @ObfuscatedName("b.d")
    public DataInputStream field222;

    @ObfuscatedName("b.c")
    public byte[] field220 = new byte[4];

    @ObfuscatedName("b.r")
    public int field221;

    @ObfuscatedName("b.f")
    public byte[] field219;

    @ObfuscatedName("b.z")
    public int field223;

    @ObfuscatedName("b.o")
    public long field217;

    public class17(class127 arg0, URL arg1) {
        this.field218 = arg0.method2488(arg1);
        this.field224 = 0;
        this.field217 = class106.method870() + 30000L;
    }

    @ObfuscatedName("b.p(I)[B")
    public byte[] method171() throws IOException {
        if (class106.method870() > this.field217) {
            throw new IOException();
        }
        if (this.field224 == 0) {
            if (this.field218.field2074 == 2) {
                throw new IOException();
            }
            if (this.field218.field2074 == 1) {
                this.field222 = (DataInputStream) this.field218.field2078;
                this.field224 = 1;
            }
        }
        if (this.field224 == 1) {
            int var1 = this.field222.available();
            if (var1 > 0) {
                if (this.field221 + var1 > 4) {
                    var1 = 4 - this.field221;
                }
                this.field221 += this.field222.read(this.field220, this.field221, var1);
                if (this.field221 == 4) {
                    int var2 = (new class110(this.field220)).method2164();
                    this.field219 = new byte[var2];
                    this.field224 = 2;
                }
            }
        }
        if (this.field224 == 2) {
            int var3 = this.field222.available();
            if (var3 > 0) {
                if (this.field223 + var3 > this.field219.length) {
                    var3 = this.field219.length - this.field223;
                }
                this.field223 += this.field222.read(this.field219, this.field223, var3);
                if (this.field223 == this.field219.length) {
                    return this.field219;
                }
            }
        }
        return null;
    }
}
