public interface iCalculable {
    iCalculable sum(int realPart, int imaginePart);
    iCalculable multi(int realPart, int imaginePart);
    int getRealResult();
    int getImagineResult();
}
