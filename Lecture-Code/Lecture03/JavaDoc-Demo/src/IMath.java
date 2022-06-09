public interface IMath {
    /**
     *
     * @param x number to take the square root of. x > 0
     * @param episoln episoln allowed relative error epislon > 0
     * @return the arppoximate square root of x
     * @requires   x > 0 and epislon > 0
     * @ensures sqrt within a relative error of actual square root
     */
    public double sqrt(double x, double episoln);
}
