package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class24 {

    @ObfuscatedName("x.f")
    public int field355;

    @ObfuscatedName("x.t")
    public class79 field361;

    @ObfuscatedName("x.n")
    public DataInputStream field357;

    @ObfuscatedName("x.e")
    public byte[] field358 = new byte[4];

    @ObfuscatedName("x.l")
    public int field359;

    @ObfuscatedName("x.d")
    public byte[] field360;

    @ObfuscatedName("x.r")
    public int field364;

    @ObfuscatedName("x.k")
    public long field362;

    public class24(class74 arg0, URL arg1) {
        this.field361 = arg0.method1509(arg1);
        this.field355 = 0;
        this.field362 = class121.method133() + 30000L;
    }

    @ObfuscatedName("x.f(I)[B")
    public byte[] method228() throws IOException {
        if (class121.method133() > this.field362) {
            throw new IOException();
        }
        if (this.field355 == 0) {
            if (this.field361.field1392 == 2) {
                throw new IOException();
            }
            if (this.field361.field1392 == 1) {
                this.field357 = (DataInputStream) this.field361.field1399;
                this.field355 = 1;
            }
        }
        if (this.field355 == 1) {
            int var1 = this.field357.available();
            if (var1 > 0) {
                if (this.field359 + var1 > 4) {
                    var1 = 4 - this.field359;
                }
                this.field359 += this.field357.read(this.field358, this.field359, var1);
                if (this.field359 == 4) {
                    int var2 = (new class127(this.field358)).method2463();
                    this.field360 = new byte[var2];
                    this.field355 = 2;
                }
            }
        }
        if (this.field355 == 2) {
            int var3 = this.field357.available();
            if (var3 > 0) {
                if (this.field364 + var3 > this.field360.length) {
                    var3 = this.field360.length - this.field364;
                }
                this.field364 += this.field357.read(this.field360, this.field364, var3);
                if (this.field364 == this.field360.length) {
                    return this.field360;
                }
            }
        }
        return null;
    }
}
