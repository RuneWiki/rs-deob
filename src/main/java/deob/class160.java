package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fi")
public final class class160 implements Runnable {

    @ObfuscatedName("fi.d")
    public InputStream field2276;

    @ObfuscatedName("fi.k")
    public OutputStream field2273;

    @ObfuscatedName("fi.e")
    public Socket field2274;

    @ObfuscatedName("fi.p")
    public boolean field2275 = false;

    @ObfuscatedName("fi.q")
    public class155 field2277;

    @ObfuscatedName("fi.s")
    public class154 field2272;

    @ObfuscatedName("fi.r")
    public byte[] field2278;

    @ObfuscatedName("fi.g")
    public int field2279 = 0;

    @ObfuscatedName("fi.v")
    public int field2280 = 0;

    @ObfuscatedName("fi.t")
    public boolean field2281 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2277 = arg1;
        this.field2274 = arg0;
        this.field2274.setSoTimeout(30000);
        this.field2274.setTcpNoDelay(true);
        this.field2274.setReceiveBufferSize(16384);
        this.field2274.setSendBufferSize(16384);
        this.field2276 = this.field2274.getInputStream();
        this.field2273 = this.field2274.getOutputStream();
    }

    @ObfuscatedName("fi.d(B)V")
    public void method2791() {
        if (this.field2275) {
            return;
        }
        synchronized (this) {
            this.field2275 = true;
            this.notifyAll();
        }
        if (this.field2272 != null) {
            while (this.field2272.field2234 == 0) {
                class182.method3711(1L);
            }
            if (this.field2272.field2234 == 1) {
                try {
                    ((Thread) this.field2272.field2242).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2272 = null;
    }

    public void finalize() {
        this.method2791();
    }

    @ObfuscatedName("fi.k(B)I")
    public int method2794() throws IOException {
        return this.field2275 ? 0 : this.field2276.read();
    }

    @ObfuscatedName("fi.e(S)I")
    public int method2795() throws IOException {
        return this.field2275 ? 0 : this.field2276.available();
    }

    @ObfuscatedName("fi.p([BIII)V")
    public void method2796(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2275) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2276.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fi.q([BIIB)V")
    public void method2797(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2275) {
            return;
        }
        if (this.field2281) {
            this.field2281 = false;
            throw new IOException();
        }
        if (this.field2278 == null) {
            this.field2278 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2278[this.field2280] = arg0[arg1 + var5];
                this.field2280 = (this.field2280 + 1) % 5000;
                if ((this.field2279 + 4900) % 5000 == this.field2280) {
                    throw new IOException();
                }
            }
            if (this.field2272 == null) {
                this.field2272 = this.field2277.method2774(this, 3);
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
                        if (this.field2280 == this.field2279) {
                            if (this.field2275) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2279;
                        if (this.field2280 >= this.field2279) {
                            var4 = this.field2280 - this.field2279;
                        } else {
                            var4 = 5000 - this.field2279;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2273.write(this.field2278, var3, var4);
                    } catch (IOException var12) {
                        this.field2281 = true;
                    }
                    this.field2279 = (this.field2279 + var4) % 5000;
                    try {
                        if (this.field2280 == this.field2279) {
                            this.field2273.flush();
                        }
                    } catch (IOException var11) {
                        this.field2281 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2276 != null) {
                        this.field2276.close();
                    }
                    if (this.field2273 != null) {
                        this.field2273.close();
                    }
                    if (this.field2274 != null) {
                        this.field2274.close();
                    }
                } catch (IOException var10) {
                }
                this.field2278 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method1775((String) null, var15);
        }
    }
}
