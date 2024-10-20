package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fa")
public final class class181 extends class315 implements Runnable {

    @ObfuscatedName("fa.x")
    public InputStream field2067;

    @ObfuscatedName("fa.m")
    public OutputStream field2068;

    @ObfuscatedName("fa.k")
    public Socket field2066;

    @ObfuscatedName("fa.d")
    public boolean field2073 = false;

    @ObfuscatedName("fa.w")
    public class176 field2069;

    @ObfuscatedName("fa.v")
    public class175 field2070;

    @ObfuscatedName("fa.q")
    public byte[] field2071;

    @ObfuscatedName("fa.z")
    public int field2065 = 0;

    @ObfuscatedName("fa.t")
    public int field2072 = 0;

    @ObfuscatedName("fa.e")
    public boolean field2074 = false;

    @ObfuscatedName("fa.s")
    public final int field2075;

    @ObfuscatedName("fa.p")
    public final int field2076;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2069 = arg1;
        this.field2066 = arg0;
        this.field2075 = arg2;
        this.field2076 = arg2 - 100;
        this.field2066.setSoTimeout(30000);
        this.field2066.setTcpNoDelay(true);
        this.field2066.setReceiveBufferSize(65536);
        this.field2066.setSendBufferSize(65536);
        this.field2067 = this.field2066.getInputStream();
        this.field2068 = this.field2066.getOutputStream();
    }

    @ObfuscatedName("fa.x(B)V")
    public void method3285() {
        if (this.field2073) {
            return;
        }
        synchronized (this) {
            this.field2073 = true;
            this.notifyAll();
        }
        if (this.field2070 != null) {
            while (this.field2070.field2034 == 0) {
                class308.method3243(1L);
            }
            if (this.field2070.field2034 == 1) {
                try {
                    ((Thread) this.field2070.field2031).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2070 = null;
    }

    public void finalize() {
        this.method3285();
    }

    @ObfuscatedName("fa.m(I)I")
    public int method3284() throws IOException {
        return this.field2073 ? 0 : this.field2067.read();
    }

    @ObfuscatedName("fa.k(I)I")
    public int method3290() throws IOException {
        return this.field2073 ? 0 : this.field2067.available();
    }

    @ObfuscatedName("fa.d(IB)Z")
    public boolean method3289(int arg0) throws IOException {
        if (this.field2073) {
            return false;
        } else {
            return this.field2067.available() >= arg0;
        }
    }

    @ObfuscatedName("fa.w([BIIB)I")
    public int method3296(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2073) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2067.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fa.v([BIIB)V")
    public void method3291(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2073) {
            return;
        }
        if (this.field2074) {
            this.field2074 = false;
            throw new IOException();
        }
        if (this.field2071 == null) {
            this.field2071 = new byte[this.field2075];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2071[this.field2072] = arg0[arg1 + var5];
                this.field2072 = (this.field2072 + 1) % this.field2075;
                if ((this.field2076 + this.field2065) % this.field2075 == this.field2072) {
                    throw new IOException();
                }
            }
            if (this.field2070 == null) {
                this.field2070 = this.field2069.method3257(this, 3);
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
                        if (this.field2072 == this.field2065) {
                            if (this.field2073) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2065;
                        if (this.field2072 >= this.field2065) {
                            var4 = this.field2072 - this.field2065;
                        } else {
                            var4 = this.field2075 - this.field2065;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2068.write(this.field2071, var3, var4);
                    } catch (IOException var12) {
                        this.field2074 = true;
                    }
                    this.field2065 = (this.field2065 + var4) % this.field2075;
                    try {
                        if (this.field2072 == this.field2065) {
                            this.field2068.flush();
                        }
                    } catch (IOException var11) {
                        this.field2074 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2067 != null) {
                        this.field2067.close();
                    }
                    if (this.field2068 != null) {
                        this.field2068.close();
                    }
                    if (this.field2066 != null) {
                        this.field2066.close();
                    }
                } catch (IOException var10) {
                }
                this.field2071 = null;
                break;
            }
        } catch (Exception var15) {
            class351.method3842((String) null, var15);
        }
    }

    @ObfuscatedName("fa.q([BIII)V")
    public void method3293(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3291(arg0, arg1, arg2);
    }
}
