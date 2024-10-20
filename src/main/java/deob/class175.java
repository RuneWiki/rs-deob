package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fb")
public final class class175 extends class171 implements Runnable {

    @ObfuscatedName("fb.m")
    public InputStream field2080;

    @ObfuscatedName("fb.f")
    public OutputStream field2070;

    @ObfuscatedName("fb.q")
    public Socket field2067;

    @ObfuscatedName("fb.w")
    public boolean field2078 = false;

    @ObfuscatedName("fb.o")
    public class168 field2066;

    @ObfuscatedName("fb.u")
    public class167 field2071;

    @ObfuscatedName("fb.g")
    public byte[] field2072;

    @ObfuscatedName("fb.l")
    public int field2073 = 0;

    @ObfuscatedName("fb.e")
    public int field2074 = 0;

    @ObfuscatedName("fb.x")
    public boolean field2075 = false;

    @ObfuscatedName("fb.d")
    public final int field2076;

    @ObfuscatedName("fb.k")
    public final int field2079;

    public class175(Socket arg0, class168 arg1, int arg2) throws IOException {
        this.field2066 = arg1;
        this.field2067 = arg0;
        this.field2076 = arg2;
        this.field2079 = arg2 - 100;
        this.field2067.setSoTimeout(30000);
        this.field2067.setTcpNoDelay(true);
        this.field2067.setReceiveBufferSize(65536);
        this.field2067.setSendBufferSize(65536);
        this.field2080 = this.field2067.getInputStream();
        this.field2070 = this.field2067.getOutputStream();
    }

    @ObfuscatedName("fb.g(I)V")
    public void method3179() {
        if (this.field2078) {
            return;
        }
        synchronized (this) {
            this.field2078 = true;
            this.notifyAll();
        }
        if (this.field2071 != null) {
            while (this.field2071.field2026 == 0) {
                class211.method3659(1L);
            }
            if (this.field2071.field2026 == 1) {
                try {
                    ((Thread) this.field2071.field2030).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2071 = null;
    }

    public void finalize() {
        this.method3179();
    }

    @ObfuscatedName("fb.w(I)I")
    public int method3177() throws IOException {
        return this.field2078 ? 0 : this.field2080.read();
    }

    @ObfuscatedName("fb.q(I)I")
    public int method3173() throws IOException {
        return this.field2078 ? 0 : this.field2080.available();
    }

    @ObfuscatedName("fb.f(II)Z")
    public boolean method3174(int arg0) throws IOException {
        if (this.field2078) {
            return false;
        } else {
            return this.field2080.available() >= arg0;
        }
    }

    @ObfuscatedName("fb.o([BIII)I")
    public int method3180(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2078) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2080.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fb.ay([BIIB)V")
    public void method3219(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2078) {
            return;
        }
        if (this.field2075) {
            this.field2075 = false;
            throw new IOException();
        }
        if (this.field2072 == null) {
            this.field2072 = new byte[this.field2076];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2072[this.field2074] = arg0[arg1 + var5];
                this.field2074 = (this.field2074 + 1) % this.field2076;
                if ((this.field2079 + this.field2073) % this.field2076 == this.field2074) {
                    throw new IOException();
                }
            }
            if (this.field2071 == null) {
                this.field2071 = this.field2066.method3147(this, 3);
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
                        if (this.field2074 == this.field2073) {
                            if (this.field2078) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2073;
                        if (this.field2074 >= this.field2073) {
                            var4 = this.field2074 - this.field2073;
                        } else {
                            var4 = this.field2076 - this.field2073;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2070.write(this.field2072, var3, var4);
                    } catch (IOException var12) {
                        this.field2075 = true;
                    }
                    this.field2073 = (this.field2073 + var4) % this.field2076;
                    try {
                        if (this.field2074 == this.field2073) {
                            this.field2070.flush();
                        }
                    } catch (IOException var11) {
                        this.field2075 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2080 != null) {
                        this.field2080.close();
                    }
                    if (this.field2070 != null) {
                        this.field2070.close();
                    }
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                } catch (IOException var10) {
                }
                this.field2072 = null;
                break;
            }
        } catch (Exception var15) {
            class166.method4746((String) null, var15);
        }
    }

    @ObfuscatedName("fb.u([BIIB)V")
    public void method3178(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3219(arg0, arg1, arg2);
    }
}
