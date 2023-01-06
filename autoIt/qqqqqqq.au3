#include <MsgBoxConstants.au3>

;Display Working Directory


$text="abc"
$nip="\order"
$new = $text & $nip


MsgBox($MB_SYSTEMMODAL, "Working Directory", @WorkingDir)
MsgBox(0,"this is",@WorkingDir)
