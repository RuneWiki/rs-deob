package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fq")
public final class class169 extends class165 implements Runnable {

    @ObfuscatedName("fq.n")
    public InputStream field2082;

    @ObfuscatedName("fq.h")
    public OutputStream field2072;

    @ObfuscatedName("fq.l")
    public Socket field2075;

    @ObfuscatedName("fq.g")
    public boolean field2074 = false;

    @ObfuscatedName("fq.b")
    public class162 field2076;

    @ObfuscatedName("fq.a")
    public class161 field2071;

    @ObfuscatedName("fq.c")
    public byte[] field2077;

    @ObfuscatedName("fq.z")
    public int field2078 = 0;

    @ObfuscatedName("fq.j")
    public int field2079 = 0;

    @ObfuscatedName("fq.d")
    public boolean field2080 = false;

    @ObfuscatedName("fq.t")
    public final int field2081;

    @ObfuscatedName("fq.f")
    public final int field2073;

    public class169(Socket arg0, class162 arg1, int arg2) throws IOException {
        this.field2076 = arg1;
        this.field2075 = arg0;
        this.field2081 = arg2;
        this.field2073 = arg2 - 100;
        this.field2075.setSoTimeout(30000);
        this.field2075.setTcpNoDelay(true);
        this.field2075.setReceiveBufferSize(65536);
        this.field2075.setSendBufferSize(65536);
        this.field2082 = this.field2075.getInputStream();
        this.field2072 = this.field2075.getOutputStream();
    }

    @ObfuscatedName("fq.a(I)V")
    public void method3287() {
        if (this.field2074) {
            return;
        }
        synchronized (this) {
            this.field2074 = true;
            this.notifyAll();
        }
        if (this.field2071 != null) {
            while (this.field2071.field2026 == 0) {
                class199.method3065(1L);
            }
            if (this.field2071.field2026 == 1) {
                try {
                    ((Thread) this.field2071.field2033).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2071 = null;
    }

    public void finalize() {
        this.method3287();
    }

    @ObfuscatedName("fq.l(B)I")
    public int method3271() throws IOException {
        return this.field2074 ? 0 : this.field2082.read();
    }

    @ObfuscatedName("fq.h(I)I")
    public int method3270() throws IOException {
        return this.field2074 ? 0 : this.field2082.available();
    }

    @ObfuscatedName("fq.n(II)Z")
    public boolean method3274(int arg0) throws IOException {
        if (this.field2074) {
            return false;
        } else {
            return this.field2082.available() >= arg0;
        }
    }

    @ObfuscatedName("fq.g([BIII)I")
    public int method3272(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2074) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2082.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fq.aa([BIII)V")
    public void method3302(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2074) {
            return;
        }
        if (this.field2080) {
            this.field2080 = false;
            throw new IOException();
        }
        if (this.field2077 == null) {
            this.field2077 = new byte[this.field2081];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2077[this.field2079] = arg0[arg1 + var5];
                this.field2079 = (this.field2079 + 1) % this.field2081;
                if ((this.field2078 + this.field2073) % this.field2081 == this.field2079) {
                    throw new IOException();
                }
            }
            if (this.field2071 == null) {
                this.field2071 = this.field2076.method3254(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2079 == this.field2078) {
                            if (this.field2074) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2078;
                        if (this.field2079 >= this.field2078) {
                            var4 = this.field2079 - this.field2078;
                        } else {
                            var4 = this.field2081 - this.field2078;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2072.write(this.field2077, var3, var4);
                    } catch (IOException var12) {
                        this.field2080 = true;
                    }
                    this.field2078 = (this.field2078 + var4) % this.field2081;
                    try {
                        if (this.field2079 == this.field2078) {
                            this.field2072.flush();
                        }
                    } catch (IOException var11) {
                        this.field2080 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2082 != null) {
                        this.field2082.close();
                    }
                    if (this.field2072 != null) {
                        this.field2072.close();
                    }
                    if (this.field2075 != null) {
                        this.field2075.close();
                    }
                } catch (IOException var10) {
                }
                this.field2077 = null;
                break;
            }
        } catch (Exception var15) {
            class160.method943((String) null, var15);
        }
    }

    @ObfuscatedName("fq.b([BIII)V")
    public void method3288(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3302(arg0, arg1, arg2);
    }
}
