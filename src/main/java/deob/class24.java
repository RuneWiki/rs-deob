package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("j")
public class class24 {

    @ObfuscatedName("j.p")
    public int field358;

    @ObfuscatedName("j.l")
    public class79 field364;

    @ObfuscatedName("j.d")
    public DataInputStream field357;

    @ObfuscatedName("j.x")
    public byte[] field356 = new byte[4];

    @ObfuscatedName("j.o")
    public int field359;

    @ObfuscatedName("j.a")
    public byte[] field360;

    @ObfuscatedName("j.w")
    public int field361;

    @ObfuscatedName("j.i")
    public long field362;

    public class24(class74 arg0, URL arg1) {
        this.field364 = arg0.method1551(arg1);
        this.field358 = 0;
        this.field362 = class121.method548() + 30000L;
    }

    @ObfuscatedName("j.p(I)[B")
    public byte[] method201() throws IOException {
        if (class121.method548() > this.field362) {
            throw new IOException();
        }
        if (this.field358 == 0) {
            if (this.field364.field1396 == 2) {
                throw new IOException();
            }
            if (this.field364.field1396 == 1) {
                this.field357 = (DataInputStream) this.field364.field1398;
                this.field358 = 1;
            }
        }
        if (this.field358 == 1) {
            int var1 = this.field357.available();
            if (var1 > 0) {
                if (this.field359 + var1 > 4) {
                    var1 = 4 - this.field359;
                }
                this.field359 += this.field357.read(this.field356, this.field359, var1);
                if (this.field359 == 4) {
                    int var2 = (new class127(this.field356)).method2489();
                    this.field360 = new byte[var2];
                    this.field358 = 2;
                }
            }
        }
        if (this.field358 == 2) {
            int var3 = this.field357.available();
            if (var3 > 0) {
                if (this.field361 + var3 > this.field360.length) {
                    var3 = this.field360.length - this.field361;
                }
                this.field361 += this.field357.read(this.field360, this.field361, var3);
                if (this.field361 == this.field360.length) {
                    return this.field360;
                }
            }
        }
        return null;
    }
}
